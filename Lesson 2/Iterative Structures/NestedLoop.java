class NestedLoop{
   public static void main(String[]args){
        int months = 2, weeks = 4;

        //outer loop prints the months
        for(int mctr = 1; mctr <= months; mctr++){
            System.out.println("Month: " + mctr);

            //inner loop prints weeks
            for(int wctr = 1; wctr <= weeks; wctr++){
                System.out.println("\tWeek: " + wctr);
            }
        }
   }
}