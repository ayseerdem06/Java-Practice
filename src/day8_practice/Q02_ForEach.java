package day8_practice;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    // Cevirisi :
    // her döngü için diziyi yazdır
    // her elemanın uzunluğunu yazdır
    // Bölüm 2:
    // for eachLoop kullanarak dizideki tüm öğeleri yazdırın
    // Bir eleman 'v' ile başlıyorsa döngüden çık

    public static void main(String[] args) {

        String[] list = {"fruits", "meat", "milk","vegetables"};

        for (String each:list) {
            System.out.println(each+" Elemanının  uzunlugu: "+ each.length());
            if(each.substring(0,1).startsWith("v")){

            }
        }

        for (String each:list) {
            if(each.startsWith("v")){
               break;
            } System.out.print(each+" ");

        }



    }
}
