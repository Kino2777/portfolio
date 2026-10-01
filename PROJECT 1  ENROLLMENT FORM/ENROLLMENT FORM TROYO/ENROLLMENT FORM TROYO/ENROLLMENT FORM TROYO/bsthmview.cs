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
    public partial class bsthmview : Form
    {
        public bsthmview()
        {
            InitializeComponent();
        }

        private void bsthmview_Load(object sender, EventArgs e)
        {
            TMlistview.Columns.Add("Full Name", 140);
            TMlistview.Columns.Add("Student ID", 90);
            TMlistview.Columns.Add("Email Address", 170);
            TMlistview.Columns.Add("Address ", 170);
            TMlistview.Columns.Add("Age", 80);
            TMlistview.Columns.Add("Gender ", 80);
            TMlistview.Columns.Add("Date of Birth", 130);
            TMlistview.Columns.Add("Course", 140);

            TMlistview.Items.Clear();

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "BSHTM")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    TMlistview.Items.Add(item);
                }

            }
        }

        private void TMlistview_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            this.Hide();
            SPAGE ef1 = new SPAGE();
            ef1.Show();
        }
    }
}
