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
    public partial class bsbaview : Form
    {
        public bsbaview()
        {
            InitializeComponent();
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

        private void panelenrolled_Paint(object sender, PaintEventArgs e)
        {

        }

        private void bsbaview_Load(object sender, EventArgs e)
        {
            BAlistview.Columns.Add("Full Name", 140);
            BAlistview.Columns.Add("Student ID", 90);
            BAlistview.Columns.Add("Email Address", 170);
            BAlistview.Columns.Add("Address ", 170);
            BAlistview.Columns.Add("Age", 80);
            BAlistview.Columns.Add("Gender ", 80);
            BAlistview.Columns.Add("Date of Birth", 130);
            BAlistview.Columns.Add("Course", 140);

            BAlistview.Items.Clear();

            foreach (var s in DataStorage.AllStudents)
            {

                if (s.Course == "BSBA")
                {
                    ListViewItem item = new ListViewItem(s.FullName);
                    item.SubItems.Add(s.StudentID);
                    item.SubItems.Add(s.Email);
                    item.SubItems.Add(s.Address);
                    item.SubItems.Add(s.Age);
                    item.SubItems.Add(s.Gender);
                    item.SubItems.Add(s.BirthDate);
                    item.SubItems.Add(s.Course);
                    BAlistview.Items.Add(item);


                }
            }
        }

        private void BAlistview_SelectedIndexChanged(object sender, EventArgs e)
        {
        
        }
        
    }
}
