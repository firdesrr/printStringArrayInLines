import java.sql.SQLOutput;

/*
Даден е масив, който съдържа адрес за изпращане на писмо.
На всяка от позициите има съответно:  [име на получател, държава, град, адрес, пощенски код].
Напишете метод, който приема като параметър такъв масив и връща като резултат низ,
 който съдържа всеки елемент от адреса на отделен ред.

Примерен резултат:
Иван Иванов
България
София
Ул. Незабравка 12
1000

 */
public class Main {
    public static String printsArr(String [] arr){
        String address="";
        for (int i=0;i<arr.length;i++){
            address+=arr[i]+'\n';
        }
        return address;
    }
    public static void main(String[] args) {
        String [] address={"Иван Иванов", "България", "София", "Ул. Незабравка 12", "1000"};
        System.out.println( printsArr(address)) ;
    }
}