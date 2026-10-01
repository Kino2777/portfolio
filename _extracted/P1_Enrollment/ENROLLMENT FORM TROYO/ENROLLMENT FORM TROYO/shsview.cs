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
    public partial class shsview : Form
    {
        public shsview()
        {
            InitializeComponent();
        }

        private void Nlistview_SelectedIndexChanged(object sender, EventArgs e)
        {
          
        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            this.Hide();
            SPAGE ef1 = new SPAGE();
            ef1.Show();
        }

        private void shsview_Load(object sender, EventArgs e)
        {

            SHSlistview.Columns.Add("Full Name", 140);
            SHSlistview.Columns.Add("Student ID", 90);
            SHSlistview.Columns.Add("Email Address", 170);
            SHSlistview.Columns.Add("Address ", 170);
            SHSlistview.Columns.Add("Age", 80);
            SHSlistview.Columns.Add("Gender ", 80);
            SHSlistview.Columns.Add("Date of Birth", 130);
            SHSlistview.Columns.Add("Course", 140);

            SHSlistview.Items.Clear();

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "SHS")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    SHSlistview.Items.Add(item);

                }
            }
        }
    }
}