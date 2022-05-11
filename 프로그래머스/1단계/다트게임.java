package program;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		
		String[] arr = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*" };
		
		
		for(int i = 0; i<arr.length; i++) {
			
			int answer = datrgame(arr[i]);
			System.out.println("정답 :  "+answer+"\n");
		}
		
	}

	private static int datrgame(String dartResult) {
		int answer = 0;
        int[] score = new int[3];
        
        char[] crr = dartResult.toCharArray();
        System.out.println(Arrays.toString(crr));
        
        int sidx = -1;
        for(int i = 0 ; i < dartResult.length(); i++ ){
            
            if(crr[i] >='0' && crr[i] <= '9'){
            	sidx++;
            	if(crr[i]=='1' && crr[i+1] =='0') {
            		i++;
                  score[sidx] += 10;
            	}else {
                score[sidx] += Character.getNumericValue(crr[i]);}
            	
            }else{
                switch(crr[i]){
                    case 'S': score[sidx]= (int) Math.pow(score[sidx], 1);
                    	System.out.print("S : ");
                       break;
                    case 'D': score[sidx]= (int) Math.pow(score[sidx], 2);
                    System.out.print("D : ");
                     break;
                    case 'T': score[sidx]= (int) Math.pow(score[sidx], 3);
                    System.out.print("T : ");
                     break;
                    case '*': 
                        if(sidx != 0){
                        	score[sidx] *=2; score[sidx-1]*=2;
                          }else{
                        	  score[sidx] *=2;};
                          System.out.print("* : ");
                     break;
                    case '#': score[sidx] *= -1;
                    System.out.print("# : ");
                     break;
                     
                }
                
            }
            System.out.println(sidx+"번째 점수 : "+score[sidx]);
            
        }
        
        answer = score[0]+score[1]+score[2];
        
        return answer;
	}

}
