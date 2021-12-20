static void analitzarLesComandes() throws NumberFormatException, IOException, SQLException {


        double valorminim=arrayNum_productes[0];
        int iminim=0;
        int maxim=0;

        for (int i = 0;arrayNum_productes[i] > 0;i++){
            if (arrayNum_productes[i]<valorminim){
                valorminim = arrayNum_productes[i];
                iminim = i;
            }
        }
        System.out.println("valor minim "+valorminim +" "+ arrayNom_proveidor[iminim]);

        double valormaxim = arrayNum_productes[0];
        for (int i = 0;arrayNum_productes[i] > 0;i++)
            if(arrayNum_productes[i]>valormaxim){
                valormaxim = arrayNum_productes[i];
                maxim = i;
            }
            System.out.println("valor maxim "+valormaxim +" "+ arrayNom_proveidor[maxim]);

            double mitjana = 0;

        for (int i =0;arrayNum_productes[i]>0;i++){
             mitjana += arrayNum_productes[i];
        }


        System.out.printf("Mitjana:"+ mitjana);
        System.out.println (" ");

    
    }
        
