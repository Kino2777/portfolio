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
    public partial class bsitview : Form
    {
        public bsitview()
        {
            InitializeComponent();
        }

        private void bsitview_Load(object sender, EventArgs e)
        {

            itlistview.Columns.Add("Full Name", 140);
            itlistview.Columns.Add("Student ID", 90);
            itlistview.Columns.Add("Email Address", 170);
            itlistview.Columns.Add("Address ", 170);
            itlistview.Columns.Add("Age", 80);
            itlistview.Columns.Add("Gender ", 80);
            itlistview.Columns.Add("Date of Birth", 130);
            itlistview.Columns.Add("Course", 140);

            itlistview.Items.Clear(); 

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "BSIT")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    itlistview.Items.Add(item);

           
                }
            }
        }

        private void bsit_Click(object sender, EventArgs e)
        {

        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

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

        private void itlistview_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void itlistview_Click(object sender, EventArgs e)
        {
     
        }
    }
}
