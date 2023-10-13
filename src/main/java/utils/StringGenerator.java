package utils;
public class StringGenerator
{
        public static <String> void StringDegenerator(int a)
        {
                if (a >0)
                {
                        java.lang.String[] RusB = new java.lang.String[]{"Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х", "Ъ", "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э", "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю", "Ё"};
                        java.lang.String[] RusS = new  java.lang.String[]{"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ё"};
                        java.lang.String[] EngB = new  java.lang.String[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
                        java.lang.String[] EngS = new  java.lang.String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
                        int[] Num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                        java.lang.String otv = "";
                        java.lang.String otv2 = "";
                        java.lang.String otv3 = "";
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
                    java.lang.String num1=""; java.lang.String num2=""; java.lang.String num3=""; java.lang.String num4="";
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