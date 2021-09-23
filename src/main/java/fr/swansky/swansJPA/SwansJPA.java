package fr.swansky.swansJPA;


import fr.swansky.swansAPI.extensions.FrameworkExtension;

public class SwansJPA extends FrameworkExtension {


    @Override
    public void load() {
        System.out.println("SwansJPA start ! ");
        for (Class<?> allScanClass : getAllScanClass()) {

            System.out.println(allScanClass);
        }
    }

    @Override
    public void unLoad() {

    }
}
