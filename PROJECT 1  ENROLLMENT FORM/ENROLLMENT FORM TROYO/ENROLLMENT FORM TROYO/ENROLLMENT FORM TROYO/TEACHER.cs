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
    public partial class TEACHER : Form
    {
        public TEACHER()
        {
            InitializeComponent();
        }

        private void TEACHER_Load(object sender, EventArgs e)
        {
            listView1.Columns.Add("Subject Code", 190);
            listView1.Columns.Add("Subject Name", 260);
            listView1.Columns.Add("Time", 190);
            listView1.Columns.Add("Schedules(Days) ", 270);


 
            listView1.Items.Clear();


            foreach (var sub in DataStorage.AllSubjects)
            {
                ListViewItem row = new ListViewItem(sub.Code);
                row.SubItems.Add(sub.Name);
                row.SubItems.Add(sub.TimeSlot);
                row.SubItems.Add(sub.Schedule);

                listView1.Items.Add(row);
            }
        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            this.Close();
            UserRole ef1 = new UserRole();
            ef1.Show();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }
    }
}
