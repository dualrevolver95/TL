/* compTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. compTokenManager.java */
import java.io.*;
import java.util.*;

/** Token Manager. */
@SuppressWarnings("unused")public class compTokenManager implements compConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x80000000L) != 0L)
            return 10;
         if ((active0 & 0x2000000000000020L) != 0L)
            return 16;
         if ((active0 & 0x1c000003ffd00L) != 0L)
         {
            jjmatchedKind = 50;
            return 8;
         }
         return -1;
      case 1:
         if ((active0 & 0x20400L) != 0L)
            return 8;
         if ((active0 & 0x1c000003df900L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 1;
            return 8;
         }
         return -1;
      case 2:
         if ((active0 & 0x18000003de900L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 2;
            return 8;
         }
         if ((active0 & 0x400000001000L) != 0L)
            return 8;
         return -1;
      case 3:
         if ((active0 & 0x8000003da000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 3;
            return 8;
         }
         if ((active0 & 0x1000000004900L) != 0L)
            return 8;
         return -1;
      case 4:
         if ((active0 & 0x292000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 4;
            return 8;
         }
         if ((active0 & 0x800000148000L) != 0L)
            return 8;
         return -1;
      case 5:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 5;
            return 8;
         }
         if ((active0 & 0x282000L) != 0L)
            return 8;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 34:
         return jjStartNfaWithStates_0(0, 31, 10);
      case 38:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 40:
         return jjStopAtPos(0, 22);
      case 41:
         return jjStopAtPos(0, 23);
      case 42:
         return jjStopAtPos(0, 4);
      case 43:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 44:
         return jjStopAtPos(0, 29);
      case 45:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 46:
         return jjStopAtPos(0, 30);
      case 47:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x2000000000000000L);
      case 58:
         return jjStopAtPos(0, 54);
      case 59:
         return jjStopAtPos(0, 28);
      case 60:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0xa00000000L);
      case 61:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 62:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x5000000000L);
      case 91:
         return jjStopAtPos(0, 26);
      case 93:
         return jjStopAtPos(0, 27);
      case 94:
         return jjStopAtPos(0, 44);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1000000004000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000001000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x400000000400L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x102000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 123:
         return jjStopAtPos(0, 24);
      case 124:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 125:
         return jjStopAtPos(0, 25);
      case 126:
         return jjStopAtPos(0, 45);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 38:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 42:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 43:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 60:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 62:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x210000L);
      case 102:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 8);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000040000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000800L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 111:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 8);
         return jjMoveStringLiteralDfa2_0(active0, 0x1100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x88000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 124:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000100000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xc2100L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 8);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4800L);
      case 116:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 46, 8);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000018000L);
      case 100:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 8);
         break;
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 8);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 8);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x180000L);
      case 114:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 8);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 8);
         break;
      case 102:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 8);
         break;
      case 107:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 8);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 116:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 8);
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 8);
         break;
      case 104:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 8);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 110:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 27;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x3ff000100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 11:
                  if ((0xfff400100000000L & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 12:
                  if (curChar == 34 && kind > 52)
                     kind = 52;
                  break;
               case 13:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if (curChar == 39 && kind > 53)
                     kind = 53;
                  break;
               case 16:
                  if (curChar == 47)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 17:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 18:
                  if ((0x2400L & l) != 0L && kind > 60)
                     kind = 60;
                  break;
               case 19:
                  if (curChar == 10 && kind > 60)
                     kind = 60;
                  break;
               case 20:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(23); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 25:
                  if (curChar == 46)
                     { jjCheckNAdd(26); }
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(26); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     { jjCheckNAdd(8); }
                  }
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 110 && kind > 9)
                     kind = 9;
                  break;
               case 1:
               case 4:
                  if (curChar == 105)
                     { jjCheckNAdd(0); }
                  break;
               case 2:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(8); }
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(8); }
                  break;
               case 10:
               case 11:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(11, 12); }
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  { jjAddStates(3, 5); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(3, 5); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 27 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x4000000000000000L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   23, 24, 25, 17, 18, 20, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\75", "\53", "\55", "\52", "\57", "\53\53", "\55\55", "\166\157\151\144", 
null, "\151\146", "\145\154\163\145", "\146\157\162", "\163\167\151\164\143\150", 
"\143\141\163\145", "\142\162\145\141\153", "\144\145\146\141\165\154\164", "\144\157", 
"\167\150\151\154\145", "\160\162\151\156\164\146", "\163\143\141\156\146", 
"\162\145\164\165\162\156", "\50", "\51", "\173", "\175", "\133", "\135", "\73", "\54", "\56", "\42", 
"\75\75", "\74\75", "\74", "\74\74", "\76\75", "\76", "\76\76", "\41\75", "\174\174", 
"\174", "\46\46", "\46", "\136", "\176", "\151\156\164", "\146\154\157\141\164", 
"\143\150\141\162", null, null, null, null, null, "\72", null, null, null, null, null, null, null, 
null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 63)
       {
          jjmatchedKind = 63;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public compTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public compTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 27; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffffL, 0x0L, 
};
static final long[] jjtoSkip = {
   0xff80000000000000L, 0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[27];
    static private final int[] jjstateSet = new int[2 * 27];

    
    static protected char curChar;
}
