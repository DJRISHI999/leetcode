public class Container_with_most_water {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length-1;
        int amt = 0;
        while(l<r){
            amt = Math.min(height[l],height[r])*(r-l);
            if(height[l]<=height[l+1]){
                l++;
            }
            if(height[r]<=height[r-1]){
                r--;
            }
        }
        return amt;
        
    }
    public static void main(String[] args) {
        Container_with_most_water solution = new Container_with_most_water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("Maximum area: " + result);
    }
    
}
