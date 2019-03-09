package com.kodilla.good.patterns.challenges.Allegro;

public class SellProcessor {

    private InformationService informationService;
    private SellService sellService;
    private SellRepository sellRepository;

    public SellProcessor(InformationService informationService,SellService sellService , SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

public SellDto process(final SellRequest sellRequest){
        boolean isSold = sellService.sell(sellRequest.getUser(),sellRequest.getDateOfSelling(),
                sellRequest.getAmountOfProduct());
        if (isSold){
            informationService.inform(sellRequest.getUser());
            sellRepository.createOrder(sellRequest.getUser(),sellRequest.getDateOfSelling(),sellRequest.getAmountOfProduct());
            return new SellDto(sellRequest.getUser(),true);
        }else{
            return new SellDto(sellRequest.getUser(),false);
        }
}
}
