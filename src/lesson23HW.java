import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson23HW {
    public static void main(String[] args) {
//        Створити класс Компьютер з полями
//                - модель
//                - рік випуску
//                - об'єм пам'яті
//                - ціна
//                - Жорсткий диск (Класс з полями)
//                - Модель жорсткого диску
//        - Тип (ссд або хдд)
//                - об'єм жорсткого диску
//                - Країна виробник
//                - Процессор(Класс)
//                -кількість ядер
//                -частота
//                -виробник
//        Створити список з 20 об'єктів.
//
//        Далі
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник не Китай
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною

Computer computer1 = new Computer("FJ932932399",2017,500,new Hard("GDGJ43434HD","SSD",1000,"China"),new Cpu("i7",2,2.8,"China"));
Computer computer2 = new Computer("FJ93545545",2008,520,new Hard("GDGJ4656yh4HD","WD",800,"China"),new Cpu("i5",3,2.6,"Korea"));
Computer computer3 = new Computer("FJ932934539",2009,300,new Hard("GDGJfdg34HD","SSD",900,"China"),new Cpu("i3",5,2.2,"India"));
        Computer computer4 = new Computer("FJ9742299",2016,200,new Hard("GDGdskjfkjd","WD",1100,"China"),new Cpu("i7",7,2.4,"USA"));
        Computer computer5 = new Computer("FJ9334344399",2015,530,new Hard("Gdfduiojks5","SSD",1200,"China"),new Cpu("i5",7,2.5,"China"));
        Computer computer6 = new Computer("FJ932222249",2008,120,new Hard("cvxcmvkl5sD","WD",1500,"China"),new Cpu("i3",6,3.0,"Korea"));
        Computer computer7 = new Computer("FJ911142399",2007,100,new Hard("uydshjfjdsfkl5","WD",1500,"China"),new Cpu("i7",5,3.8,"India"));
        Computer computer8 = new Computer("FJ9344545399",2009,200,new Hard("sdfjsjdsjj52","SSD",1400,"China"),new Cpu("i5",2,3.2,"USA"));
        Computer computer9 = new Computer("FJ93223453499",2014,260,new Hard("ryurccvjkls543","SSD",1900,"China"),new Cpu("i7",4,3.4,"China"));
        Computer computer10 = new Computer("FJ93456543399",2002,509,new Hard("fdgure85gijklwef","WD",1700,"China"),new Cpu("i7",5,3.6,"Korea"));
        Computer computer11 = new Computer("FJ9329344499",2018,430,new Hard("fjsduh7ffids8","SSD",1600,"China"),new Cpu("i3",3,1.8,"India"));
        Computer computer12 = new Computer("FJ93255399",2016,490,new Hard("sdjfdsauyf7wf20","SSD",2000,"China"),new Cpu("i5",6,2.7,"USA"));
        Computer computer13 = new Computer("FJ938782399",2011,700,new Hard("dskjfsldfdsfusd39","SSD",2000,"China"),new Cpu("i3",9,1.6,"China"));
        Computer computer14 = new Computer("FJ9326867852399",2004,600,new Hard("64674hdjksdf","WD",2100,"China"),new Cpu("i5",1,2.3,"Korea"));
        Computer computer15 = new Computer("FJ93254754399",2012,760,new Hard("fjdshysda7f4","SSD",2200,"China"),new Cpu("i5",4,2.4,"India"));
        Computer computer16 = new Computer("FJ9322456399",2013,1000,new Hard("erui4r8ferufj","WD",2300,"China"),new Cpu("i3",6,2.1,"USA"));
        Computer computer17 = new Computer("FJ93667658399",2006,501,new Hard("85855urjksld","WD",2500,"China"),new Cpu("i5",5,3.1,"China"));
        Computer computer18 = new Computer("FJ93233336399",2007,510,new Hard("u5isjklufisjf","WD",2001,"China"),new Cpu("i7",8,3.0,"Korea"));
        Computer computer19 = new Computer("FJ9378787539",2019,920,new Hard("sdfjdsfdsfasd784ik","SSD",1999,"China"),new Cpu("i3",7,3.2,"India"));
        Computer computer20 = new Computer("FJ93294565465469",2010,980,new Hard("dsfsadjkfdsasy67","WD",1918,"China"),new Cpu("i7",3,3.5,"USA"));
        List<Computer>computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);
        computers.add(computer8);
        computers.add(computer9);
        computers.add(computer10);
        computers.add(computer11);
        computers.add(computer12);
        computers.add(computer13);
        computers.add(computer14);
        computers.add(computer15);
        computers.add(computer16);
        computers.add(computer17);
        computers.add(computer18);
        computers.add(computer19);
        computers.add(computer20);
            Stream<Computer> stream = computers.stream();
            Stream<Computer> distinct = stream.distinct();
            //            Stream<Computer> computerStream = distinct.filter(computer -> computer.getComputerYear() > 2010);//Вивів всі новіші 2010 року
            //            Stream<Computer> computerStream = distinct.filter(computer -> computer.getComputerYear() > 2010).filter(computer -> computer.cpu.getCpuContry() == "China");//Вивід всі від 2010 з китайським СPU
//            Stream<Computer> computerStream = distinct.filter(computer -> computer.getComputerYear() > 2010).filter(computer -> computer.cpu.getCpuContry() != "China");//Вивід всі від 2010 тільки не з китайським СPU
//            Stream<Computer> computerStream = distinct.filter(computer -> computer.hard.getHardMemory() > 500);//Комп в якого хард більше 500 гб
//            Stream<Computer> computerStream = distinct.filter(computer -> computer.hard.getHardMemory() < 1500).filter(computer -> computer.cpu.getCPUtype() == "i7");//Хард до 1500 і процесор і7
//            Stream<Computer> computerStream = distinct.filter(computer -> computer.hard.getHardMemory() < 1500).filter(computer -> computer.cpu.getCPUtype() == "i7").sorted((o1,o2)-> o1.getComputerPrice()-o2.getComputerPrice());//Хард до 1500 і процесор і7+ сортую по ціні від найм - найб.
            Stream<Computer> computerStream = distinct.filter(computer -> computer.hard.getHardMemory() < 1500).filter(computer -> computer.cpu.getCPUtype() == "i7").sorted((o1,o2)-> o2.getComputerPrice()-o1.getComputerPrice());//Хард до 1500 і процесор і7+ сортую по ціні від найб - найм.

            List<Computer> collect = computerStream.collect(Collectors.toList());
            System.out.print(collect);

    }
}
