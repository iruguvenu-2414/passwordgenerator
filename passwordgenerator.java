// Source code is decompiled from a .class file using FernFlower decompiler.
import java.security.SecureRandom;

public class passwordgenerator {
   private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
   private static final String DIGITS = "0123456789";
   private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";
   private static final String ALL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";

   public passwordgenerator() {
   }

   public static void main(String[] var0) {
      byte var1 = 12;
      String var2 = generatePassword(var1);
      System.out.println("Generated Password: " + var2);
   }

   public static String generatePassword(int var0) {
      SecureRandom var1 = new SecureRandom();
      StringBuilder var2 = new StringBuilder(var0);

      for(int var3 = 0; var3 < var0; ++var3) {
         int var4 = var1.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?".length());
         var2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?".charAt(var4));
      }

      return var2.toString();
   }
}

