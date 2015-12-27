
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int aNum = 0;
        int bNum = 0;
        int[] nums = new int[10];
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                aNum++;
            }
            else{
                nums[secret.charAt(i) - '0']++;
                if(nums[secret.charAt(i) - '0'] <= 0){
                    bNum++;
                }
                
                nums[guess.charAt(i) - '0']--;
                if(nums[guess.charAt(i) - '0'] >= 0){
                    bNum++;
                }
            }
        }
        
        return aNum + "A" + bNum + "B";           
    }
}
