public class Strings {
    public static void main(String[] args) {
        int a =5;// примитивный тип данных\
        /*/разница в том что примитивный тип данных хранит значение в коробке памяти
        а ссылочный ссылается на объект класса стринг */
        String string = "Ramis";// ссылочный тип данных
        System.out.println(string);
        String space = " ";
        String name = "Ramis";
        System.out.println(string+space+name);
        System.out.println("Hello"+space+name);
        System.out.println(string+space+a);

    }

}
