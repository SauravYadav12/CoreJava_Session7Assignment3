class Substrings{


    public static boolean isPresent(char[] apple, char[] webapple) {
    for (int i = 0; i < webapple.length - apple.length+1; i++) {
        for (int j = 0; j < apple.length; j++) {
            if (webapple[i + j] == apple[j]) {
                if (j == apple.length - 1) {
                    System.out.println("String Found");
                    return true;
                }
            } else {
                System.out.println("Not Found")
                break;
            }
        }
    }
    return false;
 }

  public static void main(String[] args) {
    String webapple = "webapple";
    String apple = "apple";
    char[] webappleArray = webapple.toCharArray();
    char[] appleArray = apple.toCharArray();
    System.out.println(isPresent(appleArray, webappleArray));
}

}
