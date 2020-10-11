public class Simulator {
    public static void main(String[] args) {
        Jumper[] jumpers = new Jumper[3];

        jumpers[0] = new Jumper("Kofler", 36, 4, 4, 4, 7);
        jumpers[1] = new Jumper("Morgenstern", 33, 7, 7, 7, 8);
        jumpers[2] = new Jumper("Schlierenzauer", 30, 8, 8, 9, 10);

        SkiJump jump1 = new SkiJump("Paul-Außerleitner-Schanze", "Bischofshofen", 125, 142);
        SkiJump jump2 = new SkiJump("Bergisel", "Innsbruck", 120, 130);

        Competition comp1 = new Competition(jumpers, jump1);
        Competition comp2 = new Competition(jumpers, jump2);

        comp1.start();
        comp2.start();
    }
}
