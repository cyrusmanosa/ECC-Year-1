package kad26;

import java.util.*;

/*
	仕様に書いてある通りに[じゃんけん]さえ動けばいいの【極端な例】です
	あなたなら、このプログラムに対して
	どのようにフィードバックやアドバイス
	もしくは修正を行いますか？
*/

class TryJanken{
public static void main(String[] args){
Scanner a = new Scanner(System.in);
// 配列で-1を見付けるまで繰り返す
while(true == true){
System.out.println("何を出しますか？>");
int b = a.nextInt();
int c = (int)(Math.random()*3);// ダイスの出目
if(b == 0){
// グー
if(c == 0){System.out.println("あいこ");
                                                                }if(c == 1){
//グー
                                                                	System.out.println("勝ち");}
// グー
if(c == 2){
                                            System.out.println("負け");
}}
// グー
if(b == 1){
                                        if(c == 0){
                                    System.out.println("負け");}
                                                    if(c == 1){System.out.println("あいこ");
}
// グー
if(c == 2){
System.out.println("勝ち");}}
                                    if(b == 2){if(c == 0){
System.out.println("勝ち");}if(c == 1){
System.out.println("あいこ");
                                }if(c == 2){
                System.out.println("負け");
}}if(b == -1){break;
}}}}