package org.runite.jagex;
import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

final class Canvas_Sub1 extends Canvas implements FocusListener {

   static int anInt14 = 0;
   static int anInt15 = 0;
   static int anInt16;
   static int anInt17;
   static int anInt18;
   static int anInt19;
   static int[][] anIntArrayArray20 = new int[5][5000];
   static Class93 aClass93_21 = new Class93(64);
   static int registryStage = 0;
   static int anInt25 = 1;


   public static void method53(int var0) {
      try {
         aClass93_21 = null;
         anIntArrayArray20 = (int[][])null;
         if(var0 != 0) {
            aClass93_21 = (Class93)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.clientError(var2, "oe.C(" + var0 + ')');
      }
   }

   static final int method54(int var0) {
      try {
         return false ?-81:var0 & 127;
      } catch (RuntimeException var3) {
         throw Class44.clientError(var3, "oe.A(" + var0 + ',' + false + ')');
      }
   }

   static final void method55() {
      try {
         if(22683 != 22683) {
            method53(43);
         }

         aClass93_21.method1523((byte)-100);
         Class99.aClass93_1401.method1523((byte)-105);
         Class3_Sub28_Sub7_Sub1.aClass93_4051.method1523((byte)-101);
         Class154.aClass93_1965.method1523((byte)-119);
      } catch (RuntimeException var2) {
         throw Class44.clientError(var2, "oe.B(" + 22683 + ')');
      }
   }

@Override
public void focusGained(FocusEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void focusLost(FocusEvent e) {
	// TODO Auto-generated method stub
	
}

}
