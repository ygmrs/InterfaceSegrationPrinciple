public class Main {

    public static void main(String[] args){
        JohnDoe johnDoe = new JohnDoe() {
            @Override
            public void highJump() {

            }

            @Override
            public void longJump() {

            }
        };
        johnDoe.compete();
        johnDoe.swim();
    }


}
