package kad26;

import java.util.*;

/*
	�d�l�ɏ����Ă���ʂ��[����񂯂�]���������΂����́y�ɒ[�ȗ�z�ł�
	���Ȃ��Ȃ�A���̃v���O�����ɑ΂���
	�ǂ̂悤�Ƀt�B�[�h�o�b�N��A�h�o�C�X
	�������͏C�����s���܂����H
*/

class TryJanken{
public static void main(String[] args){
Scanner a = new Scanner(System.in);
// �z���-1�����t����܂ŌJ��Ԃ�
while(true == true){
System.out.println("�����o���܂����H>");
int b = a.nextInt();
int c = (int)(Math.random()*3);// �_�C�X�̏o��
if(b == 0){
// �O�[
if(c == 0){System.out.println("������");
                                                                }if(c == 1){
//�O�[
                                                                	System.out.println("����");}
// �O�[
if(c == 2){
                                            System.out.println("����");
}}
// �O�[
if(b == 1){
                                        if(c == 0){
                                    System.out.println("����");}
                                                    if(c == 1){System.out.println("������");
}
// �O�[
if(c == 2){
System.out.println("����");}}
                                    if(b == 2){if(c == 0){
System.out.println("����");}if(c == 1){
System.out.println("������");
                                }if(c == 2){
                System.out.println("����");
}}if(b == -1){break;
}}}}