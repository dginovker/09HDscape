package org.runite.jagex;

final class Class3_Sub28_Sub2 extends Node {

   static int anInt3542;
   Class140_Sub2 aClass140_Sub2_3545;


   public static void method534(int var0) {
      try {
         int var1 = 101 % ((-29 - var0) / 45);
      } catch (RuntimeException var2) {
         throw Class44.clientError(var2, "bk.B(" + var0 + ')');
      }
   }

   static void method535(byte var0, int var1) {
      try {
         Class151.aFloatArray1934[0] = (float)Class3_Sub28_Sub15.method633(255, var1 >> 16) / 255.0F;
         Class151.aFloatArray1934[1] = (float)Class3_Sub28_Sub15.method633(var1 >> 8, 255) / 255.0F;
         Class151.aFloatArray1934[2] = (float)Class3_Sub28_Sub15.method633(255, var1) / 255.0F;
         Class3_Sub18.method383(-32584, 3);
         Class3_Sub18.method383(-32584, 4);
         if(var0 != 56) {
            method535((byte)127, 99);
         }

      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "bk.A(" + var0 + ',' + var1 + ')');
      }
   }

   static Class75_Sub3 method536(RSByteBuffer var1) {
      try {
         if((byte) 54 != 54) {
            method534(117);
         }

         return new Class75_Sub3(var1.getShort((byte)25), var1.getShort((byte)73), var1.getShort((byte)114), var1.getShort((byte)33), var1.getShort((byte)78), var1.getShort((byte)91), var1.getShort((byte)120), var1.getShort((byte)113), var1.getTriByte((byte)115), var1.getByte((byte)-64));
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "bk.C(" + (byte) 54 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   Class3_Sub28_Sub2(Class140_Sub2 var1) {
      try {
         this.aClass140_Sub2_3545 = var1;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "bk.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}
