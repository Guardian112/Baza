package utils;
public class StringGenerator
{
        public static void StringDegenerator(int a){
                if (a >0) {
                        String[] RusB = new String[]{"Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х", "Ъ", "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э", "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю", "Ё"};
                        String[] RusS = new String[]{"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ё"};
                        String[] EngB = new String[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
                        String[] EngS = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
                        int[] Num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                        String otv = "";
                        String otv2 = "";
                        String otv3 = "";
                        int b = (int) Math.round(Math.random() * 100) % 33;
                        otv += RusB[b];
                        b = (int) Math.round(Math.random() * 100) % 26;
                        otv2 += EngB[b];
                        b = (int) Math.round(Math.random() * 100) % 9 + 1;
                        otv3 += Num[b];
                        a -= 1;
                        for (int i = 0; i < a; i++)
                        {
                                b = (int) Math.round(Math.random() * 100) % 33;
                                otv += RusS[b];
                                b = (int) Math.round(Math.random() * 100) % 26;
                                otv2 += EngS[b];
                                b = (int) Math.round(Math.random() * 100) % 10;
                                otv3 += Num[b];
                        }
                        String num1=""; String num2=""; String num3=""; String num4="";
                        for (int i = 0; i < 3; i++)
                        {
                                b = (int) Math.round(Math.random() * 100) % 10;
                                num1 += Num[b];
                                b = (int) Math.round(Math.random() * 100) % 10;
                                num2 += Num[b];
                        }
                        for (int i = 0; i < 2; i++)
                        {
                                b = (int) Math.round(Math.random() * 100) % 10;
                                num3 += Num[b];
                                b = (int) Math.round(Math.random() * 100) % 10;
                                num4 += Num[b];
                        }
                        System.out.println("Строка: " + otv);
                        System.out.println("Число: " + otv3);
                        System.out.println("Цифра: " + (int) Math.round(Math.random() * 100) % 9);
                        System.out.println("Почта: " + otv2 + "@gmail.com");
                        System.out.println("Телефон: +7("+num1+")"+num2+"-"+num3+"-"+num4);
                }
                else
                {
                        System.out.println("Ты тупой?");
                }
        }
}