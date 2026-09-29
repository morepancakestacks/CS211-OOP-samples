class ArrayCopyMethod{
    public static void main(String[] args) {
        String[] source = {"Luna", "Kalix", 
                          "Yanna", "Hiro",
                          "Elyse", "Sevi", 
                          "Sam", "Clyden",
                          "Via", "Arkin",
                          "Kierra", "Shan"
                        };
        String[] destination = new String[2];
        System.arraycopy(source, 1, destination, 2, 3);
                        // (source, sourcePosition, destination, destinationPosition, no. of elements)
        destination[0] = "Nanno";
       // destination[1] = "Gwy";
        //destination[5] = "Shan";

        boolean isFirst = true;
        for(String character : destination){
            if(!isFirst){
                System.out.print(", ");
            }
            System.out.print(character);
            isFirst = false;
        }
    }

    /*
        OUTPUT
        Sam
        Clyden
     */
}