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
    public partial class bsenview : Form
    {
        public bsenview()
        {
            InitializeComponent();
        }

        private void ITlistview_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
            

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            this.Hide();
            SPAGE ef1 = new SPAGE();
            ef1.Show();
        }

        private void bsenview_Load(object sender, EventArgs e)
        {
        
            ENlistview.Columns.Add("Full Name", 140);
            ENlistview.Columns.Add("Student ID", 90);
            ENlistview.Columns.Add("Email Address", 170);
            ENlistview.Columns.Add("Address ", 170);
            ENlistview.Columns.Add("Age", 80);
            ENlistview.Columns.Add("Gender ", 80);
            ENlistview.Columns.Add("Date of Birth", 130);
            ENlistview.Columns.Add("Course", 140);

            ENlistview.Items.Clear();

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "BSEN")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    ENlistview.Items.Add(item);


                }
            }
        }
    }
}
