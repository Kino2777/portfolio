using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ENROLLMENT_FORM_TROYO
{
   public static class DataStorage
    {
        public static string CurrentUserRole = "";
        public static List<Student> AllStudents = new List<Student>();

 
        public static List<Subject> AllSubjects = new List<Subject>();
    }

    public class Student
    {
        public string FullName { get; set; }
        public string StudentID { get; set; }
        public string Email { get; set; }
        public string Address { get; set; }
        public string Age { get; set; }
        public string Gender { get; set; }
        public string BirthDate { get; set; }
        public string Course { get; set; }
    }
    public class Subject
    {
        public string Code { get; set; }
        public string Name { get; set; }
        public string TimeSlot { get; set; }
        public string Schedule { get; set; }
    }
}