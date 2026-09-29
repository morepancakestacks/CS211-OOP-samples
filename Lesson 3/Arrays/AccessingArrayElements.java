class AccessingArrayElements {
    public static void main(String[] args) {
        String[] colours = {"peach", "slate grey", "burgundy", "teal", "cobalt blue"};
        System.out.println("Length of the array: " + colours.length);
        System.out.println(colours[0]);
        System.out.println(colours[1]);
        System.out.println(colours[2]);
        System.out.println(colours[3]);
        System.out.println(colours[4]);

        colours[5] = "periwinkle";
        System.out.println(colours[5]);

        System.out.println("Continuing with the program...");

    }
}
