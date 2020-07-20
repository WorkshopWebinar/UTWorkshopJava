public class CoinFlipper {
    public static void main(String args[]) {
        System.out.println("<------ FLIPPED COIN ---->");
        CoinFlipper coinFlipper = new CoinFlipper();
        RandomGenerator randomGenerator = new RandomGenerator();
        Result result = coinFlipper.flipCoin(randomGenerator,0,1);
        System.out.println("Result:"+result.name());

    }

    public Result flipCoin(RandomGenerator randomGenerator, int x , int y) {
        int result = randomGenerator.generate(x,y);
        return (result > 0) ?Result.HEADS: Result.TAILS;
    }

    enum Result {
        HEADS,
        TAILS
    }
}
