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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
           
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked == true)
            {
                passbox.UseSystemPasswordChar = false;
            }
            else
            {
                passbox.UseSystemPasswordChar = true;
            }
        }

        private void Form1_Click(object sender, EventArgs e)
        {
            userRole.Items.Add("STUDENT");
            userRole.Items.Add("FACULTY");
            userRole.Items.Add("ADMIN");
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(userRole.Text))
            {
                MessageBox.Show("Please select a role."); return;
            }
            bool isValid = false;

            switch (userRole.Text)
            {
                case "STUDENT":
                    if (userbox.Text == "Julio" && passbox.Text == "1234")
                    {
                        isValid = true;
                    }
                    break;
                case "TEACHER":
                    if (userbox.Text == "Ron" && passbox.Text == "1234")
                    {
                        isValid = true;
                    }
                    break;
                case "ADMIN":
                    if (userbox.Text == "Admin" && passbox.Text == "1234")
                    {
                        isValid = true;
                    }
                    break;
            }
            if (isValid)
            {
                string role = userRole.Text;
                MessageBox.Show("Login Successful!");
                UserRole ef1 = new UserRole(role);
                ef1.Show();
                this.Hide();


            }
            else
            {
                MessageBox.Show("Invalid username or password please try again.");
                userbox.Clear();
                passbox.Clear();
                userbox.Focus();
            }
        }

        private void userRole_Click(object sender, EventArgs e)
        {
            userRole.Enabled = true;
        }
    }
}

