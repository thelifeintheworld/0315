package com.test.night;
/*
 * 4�����һ����Student���������������ѧ�źͳɼ���
 * ���һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��[ѡ����]
 * */
public class Student {
		String name;
		int sno;
		double grade;
		public Student() {
			
		}
		public Student(String name,int sno,double grade) {
			this.name = name;
			this.sno = sno;
			this.grade = grade;
		}
//	public void sort(String[] Student) {
//		for(int i=0;i<Student.length;i++){
//			for(int j =0;j<Student.length-i-1;j++) {
//				if(Student[j].grade	< Student[j+1].grade) {
//					double 	temp = a[j];
//							a[j]=a[j+1];
//							a[j+i] = temp;
//				}
//			}
//			System.out.print(Student[i].name);
//		}
		public void sort(Student aStudent) {
		if(this.grade>aStudent.grade) {
			System.out.print(this.name+"\t"+aStudent.name);
		}else {
			System.out.print(aStudent.name+"\t"+this.name);
		}
		System.out.println();
	}	
}
