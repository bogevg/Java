import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static Logger logger =  Logger.getLogger(Main.class.getName());
    private FileHandler fh = null;
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("Log.txt", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.setUseParentHandlers(false);
            logger.info("Start program ");
            View view = new View();
            Scanner console = new Scanner(System.in);
            ComplexNumber a = new ComplexNumber();
            ComplexNumber b = new ComplexNumber();
            String s="";
            while (true){
                System.out.print("Введите действие: ");
                s = console.nextLine();
                if (s.equals("exit")){
                    logger.info("End program ");
                    System.exit(1);
                }
                System.out.print("Введите действительную часть первого числа: ");
                a.setRes(console.nextInt());
                System.out.print("Введите мнимую часть первого числа: ");
                a.setIm(console.nextInt());
                System.out.print("Введите действительную часть второго числа: ");
                b.setRes(console.nextInt());
                System.out.print("Введите мнимую часть второго числа: ");
                b.setIm(console.nextInt());
                System.out.println("Ответ: ");
                switch (s){
                    case ("+"):
                        view.sumButtom(a, b);
                        logger.info("calculating the sum");
                            break;
                    case ("*"):
                        view.multButton(a, b);
                        logger.info("calculating the mult");
                            break;
                    case ("/"):
                        view.diwButton(a, b);
                        logger.info("calculating the div");
                            break;
                    default:
                            System.out.println("Нет такой команды");
                }
            console.nextLine();
            }
        } catch (Exception e) {
            logger.info(e.toString());
        }
    }
    
}
