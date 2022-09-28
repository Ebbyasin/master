package src.calismalarim;


    public class Rope {
        public static void Swing(){
            System.out.println("swing");
        }
        public void Climb(){
            System.out.println("climb");
        }
        public static void Play(){
            Swing();
            

        }

        public static void main(String[] args) {
            Rope rope=new Rope();
            rope.Play();
            Rope rope1=null;
            rope1.Play();
        }
    }

