package Program;

//public class Solution {

    class Solution {
        static int dataTypeSize(String str) {
            // code here
            if(str == "Character"){
                return 1;
            }else if(str == "Integer" || str == "Float"){
                return 4;
            }else if (str == "Long" || str == "Double"){
                return 8;
            }
            else{
                return 0;
            }
        }

        public static void main(String[] args) {
            dataTypeSize("Character");
        }
    }

