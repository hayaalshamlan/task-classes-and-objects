public class Course {
    
       
         String courseName;
        String instructor;
        int numberOfStudents;

        Course(String courseStudetName, String instructorName, int AddNumberOfStudents){
           courseName = courseStudetName;
           instructor = instructorName;
           numberOfStudents = AddNumberOfStudents;
        }
           
           public String getcourseName(){
           return courseName;
           }
           public void setcourseName(String courseStudentName){
            courseName = courseStudentName;
           }
           public String getinstructor(){
           return instructor;
           }
           public void setinstructor(String instructorName){
            instructor = instructorName;
           }
            public int getnumberOfStudents(){
           return numberOfStudents;
           }
           public void setnumberOfStudents(int AddNumberOfStudents){
            numberOfStudents = AddNumberOfStudents;
        }
        @Override
         public String toString(){
            return "course Name: " + courseName + ", instructor name: " + instructor + ", number Of Students " + numberOfStudents;
         }

        public static void main(String[] args) throws Exception {
            Course haya = new Course("haya", "amal", 3);
            System.out.println(haya);
        }
    } 
    

    
// }
