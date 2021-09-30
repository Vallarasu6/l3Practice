package conference;

import java.util.ArrayList;

public class ProcessLayer {

    public void process(ArrayList<String> list){
        PojoEvent pojoEvent;
        ArrayList<PojoEvent> obj = new ArrayList<PojoEvent>();

        for(String s : list){
        String arr[] = s.split(" ");
        String a = arr[arr.length-1];
            System.out.println(a);
            int sum = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='m'){
                break;
            }else if(a.charAt(i)=='l'){
                sum=5;
                break;
            }
            else {
                sum = (sum*10)+Integer.parseInt(String.valueOf(a.charAt(i)));
            }

        }

            pojoEvent = new PojoEvent();
            pojoEvent.setEvent(s);
            pojoEvent.setTime(sum);
            obj.add(pojoEvent);

                    sum=0;

        }
        System.out.println(obj);
        data(obj);
    }
    public void data(ArrayList<PojoEvent> obj) {
        PojoEvent pojoEvent = new PojoEvent();
        int startTime = 9;
        int temp = 00;
        int count =0;
        ArrayList<PojoEvent> notCheck = new ArrayList<>();
        for (int i = 0; i < obj.size(); i++) {
            count++;
            pojoEvent = obj.get(i);
            if (temp == 00 ) {
                    System.out.println(startTime + ":" + temp + "0 AM " + pojoEvent.getEvent());
                    temp += pojoEvent.getTime();
                } else {
                    if (temp < 60 && startTime < 12 && startTime!=11) {
                        System.out.println(startTime + ":" + temp + " AM " + pojoEvent.getEvent());
                        temp += pojoEvent.getTime();
                    } else if (temp >= 60) {
                        startTime++;
                        temp = temp - 60;

                        if (startTime < 12 && startTime!=11) {
                            System.out.println(startTime + ":" + temp + " AM " + pojoEvent.getEvent());
                            temp += pojoEvent.getTime();
                        }
                        //int total = temp+pojoEvent.getTime();
                        else if (startTime == 11 && (temp+pojoEvent.getTime())<=60) {
                            System.out.println(startTime + ":" + temp + " AM " + pojoEvent.getEvent());
                            temp += pojoEvent.getTime();
                        }
                        else {
                            if(count<obj.size()){
                                startTime--;
                                temp=temp+60;
                                notCheck.add(obj.get(i));
                                continue;
                            }
                        }
                    }
                }
        }
        System.out.println("12 o clc lunch");
        int noon = 1;
        int temp1 = 0;
        int count1=0;
        for(int j=0;j< notCheck.size();j++){
            count1++;
            pojoEvent = notCheck.get(j);
            if (temp1 == 0) {
                        System.out.println(noon + ":" + temp1 + "0 " + " PM " + pojoEvent.getEvent());
                        temp1 += pojoEvent.getTime();
                    } else {
                        if (temp1 < 60 && noon <5 && noon!=4) {
                            System.out.println(noon + ":" + temp1 + " PM " + pojoEvent.getEvent());
                            temp1 += pojoEvent.getTime();
                        }
                        else if(noon==4 && (temp1+ pojoEvent.getTime())<=60){
                        System.out.println(noon + ":" + temp1 + " PM " + pojoEvent.getEvent());
                        temp1 += pojoEvent.getTime();
                }
                        else if (temp1 >= 60 ) {
                            noon++;
                            temp1 = temp1-60;
                            if (noon <5 && noon!=4) {

                                System.out.println(noon+ ":" + temp1 + " PM " + pojoEvent.getEvent());
                                temp1 += pojoEvent.getTime();
                            }
                            else if(noon == 4 && temp1+pojoEvent.getTime()<=60){
                                System.out.println(noon+ ":" + temp1 + " PM " + pojoEvent.getEvent());
                                temp1 += pojoEvent.getTime();
                            }
                            else {
                                if(count1<notCheck.size()){
                                    System.out.println(count1);
                                    continue;
                                }

                            }
                        }
                    }
                }
        System.out.println("NetWork Event");




        }
    }

