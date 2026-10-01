using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ENROLLMENT_FORM_TROYO
{
    public partial class UserRole : Form
    {
        public UserRole()
{
    InitializeComponent();
        }
        public UserRole(string role)
        {
            InitializeComponent();
            userRole = role;
        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {

        }

        private void UserRole_Load(object sender, EventArgs e)
        {
           
            ADMIN.Enabled = true;
            STUDENT.Enabled = true;
            TEACHER.Enabled = true;

           
            if (DataStorage.CurrentUserRole == "STUDENT")
            {
                ADMIN.Enabled = false;
                TEACHER.Enabled = false;
            }
            else if (DataStorage.CurrentUserRole == "TEACHER")
            {
                ADMIN.Enabled = false;
                STUDENT.Enabled = false;
            }
            
        }
        private string userRole;

        private void STUDENT_MouseEnter(object sender, EventArgs e)
        {
            STUDENT.BackColor = Color.LightBlue;
        }

        private void STUDENT_MouseLeave(object sender, EventArgs e)
        {
            STUDENT.BackColor = Color.Transparent;
        }

        private void TEACHER_MouseEnter(object sender, EventArgs e)
        {
            TEACHER.BackColor = Color.Green;
        }

        private void TEACHER_MouseLeave(object sender, EventArgs e)
        {
            TEACHER.BackColor = Color.Transparent;
        }

        private void ADMIN_MouseEnter(object sender, EventArgs e)
        {
            ADMIN.BackColor = Color. MistyRose;
         
        }

        private void ADMIN_MouseLeave(object sender, EventArgs e)
        {
            ADMIN.BackColor = Color.Transparent;
            STUDENT.BackColor = Color.Transparent;
            TEACHER.BackColor = Color.Transparent;
        }

        private void STUDENT_Click(object sender, EventArgs e)
        {
            SPAGE  ef1 = new SPAGE();
            ef1.Show();
            this.Close();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.Close();
            Form1 ef1 = new Form1();
            ef1.Show();
        }

        private void UserRole_Click(object sender, EventArgs e)
        {

        }

        private void ADMIN_Click(object sender, EventArgs e)
        {

            this.Close();
            APAGE ef1 = new APAGE ();
            ef1.Show();
            
        }

        private void TEACHER_Click(object sender, EventArgs e)
        {
            this.Close();
            TEACHER ef1 = new TEACHER();
            ef1.Show();
        }
        }
    }

    
          
       
