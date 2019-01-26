public abstract class JohnDoe implements  SwimmingAthlete{

    @Override
    public void compete() {
        System.out.println("JohnDoe started competing");
    }

    @Override
    public void swim() {
        System.out.println("JohnDoe started swimming");
    }

}
