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
    public partial class bsnview : Form
    {
        public bsnview()
        {
            InitializeComponent();
        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            this.Hide();
            SPAGE ef1 = new SPAGE();
            ef1.Show();
        }

        private void label12_Click(object sender, EventArgs e)
        {

        }

        private void bsnview_Load(object sender, EventArgs e)
        {
            Nlistview.Columns.Add("Full Name", 140);
            Nlistview.Columns.Add("Student ID", 90);
            Nlistview.Columns.Add("Email Address", 170);
            Nlistview.Columns.Add("Address ", 170);
            Nlistview.Columns.Add("Age", 80);
            Nlistview.Columns.Add("Gender ", 80);
            Nlistview.Columns.Add("Date of Birth", 130);
            Nlistview.Columns.Add("Course", 140);

            Nlistview.Items.Clear();

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "BSN")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    Nlistview.Items.Add(item);


                }
            }
        }

        private void Nlistview_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}

     
  
