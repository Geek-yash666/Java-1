import java.io.*;

class LeontiefModel {
	public static void main (String[] args) {
		
    	float[][] consumptionMatrix = {{0.1, 0.5, 0}, {0.8, 0, 0.4}, {0.1, 0.5, 0.6}};
    	
    	int industries = consumptionMatrix.length;
    	float[][] technicalMatrix = technicalMatrix(consumptionMatrix);
		    
	}
	
	public static float[][] technicalMatrix(float mat[][]) {
	    
	    float techMatrix[mat.length][mat[0].length];
	    for(int row = 0; row < mat.length; row++) {
	        
	        for(int col = 0; col < mat[0].length; col++) {
	            
	            float sum = 0;
	            for (int index = 0; index < mat.length; index++ ) {
	                
	                sum += mat[row][index]
	            }
	            techMatrix[row][col] = mat[row][col] / sum;
	        }
	    }
	}
}
