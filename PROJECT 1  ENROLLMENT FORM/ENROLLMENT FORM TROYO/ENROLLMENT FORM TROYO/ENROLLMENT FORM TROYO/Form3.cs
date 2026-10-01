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
    public partial class APAGE : Form
    {
        public APAGE()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            listView1.Columns.Add("Full Name", 90);
            listView1.Columns.Add("Student ID", 90);
            listView1.Columns.Add("Email Address", 90);
            listView1.Columns.Add("Address ", 80);
            listView1.Columns.Add("Age", 80);
            listView1.Columns.Add("Gender ", 90);
            listView1.Columns.Add("Date of Birth", 100);
            listView1.Columns.Add("Course", 170);
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void NEWBTN_MouseEnter(object sender, EventArgs e)
        {
            pictureBox1.BackColor = Color.Green;
        }

        private void NEWBTN_MouseLeave(object sender, EventArgs e)
        {
            pictureBox1.BackColor = Color.Transparent;
        }

        private void DBTN_Click(object sender, EventArgs e)
        {
            listView1.Items.Remove(listView1.SelectedItems[0]);

            UBTN.Enabled = false;
            DBTN.Enabled = false;
            NBTN.Enabled = true;

            FNBOX.Text = "";
            IDBOX.Text = "";
            EABOX.Text = "";
            ADDBOX.Text = "";
            ABOX.Text = "";
            GBOX.Text = "";
            DOBBOX.Text = "";
            CBOX.Text = "";

            FNBOX.Enabled = false;
            IDBOX.Enabled = false;
            EABOX.Enabled = false;
            ADDBOX.Enabled = false;
            ABOX.Enabled = false;
            GBOX.Enabled = false;
            DOBBOX.Enabled = false;
            CBOX.Enabled = false;
        }

        private void NBTN_Click(object sender, EventArgs e)
        {
            FNBOX.Enabled = true;
            IDBOX.Enabled = true;
            EABOX.Enabled = true;
            ADDBOX.Enabled = true;
            ABOX.Enabled = true;
            GBOX.Enabled = true;
            DOBBOX.Enabled = true;
            CBOX.Enabled = true;

            NBTN.Enabled = false;
            ABTN.Enabled = true;
            UBTN.Enabled = false;
            DBTN.Enabled = false;
        }

        private void ABTN_Click(object sender, EventArgs e)
        {

            Student tempStudent = new Student();
            tempStudent.FullName = FNBOX.Text;
            tempStudent.StudentID = IDBOX.Text;
            tempStudent.Email = EABOX.Text;
            tempStudent.Address = ADDBOX.Text;
            tempStudent.Age = ABOX.Text;
            tempStudent.Gender = GBOX.Text;
            tempStudent.BirthDate = DOBBOX.Text;
            tempStudent.Course = CBOX.Text;

            DataStorage.AllStudents.Add(tempStudent);


            ListViewItem troyo = new ListViewItem(FNBOX.Text);
            troyo.SubItems.Add(IDBOX.Text);
            troyo.SubItems.Add(EABOX.Text);
            troyo.SubItems.Add(ADDBOX.Text);
            troyo.SubItems.Add(ABOX.Text);
            troyo.SubItems.Add(GBOX.Text);
            troyo.SubItems.Add(DOBBOX.Text);
            troyo.SubItems.Add(CBOX.Text);
            listView1.Items.Add(troyo);

            MessageBox.Show("Student Enrolled Successfully!");


            ABTN.Enabled = false;
            NBTN.Enabled = true;
            UBTN.Enabled = false;
            DBTN.Enabled = false;

            FNBOX.Text = "";
            IDBOX.Text = "";
            EABOX.Text = "";
            ADDBOX.Text = "";
            ABOX.Text = "";
            GBOX.Text = "";
            DOBBOX.Text = "";
            CBOX.Text = "";


            FNBOX.Enabled = false;
            IDBOX.Enabled = false;
            EABOX.Enabled = false;
            ADDBOX.Enabled = false;
            ABOX.Enabled = false;
            GBOX.Enabled = false;
            DOBBOX.Enabled = false;
            CBOX.Enabled = false;
        }

        private void UBTN_Click(object sender, EventArgs e)
        {
            listView1.SelectedItems[0].SubItems[0].Text = FNBOX.Text;
            listView1.SelectedItems[0].SubItems[1].Text = IDBOX.Text;
            listView1.SelectedItems[0].SubItems[2].Text = EABOX.Text;
            listView1.SelectedItems[0].SubItems[3].Text = ADDBOX.Text;
            listView1.SelectedItems[0].SubItems[4].Text = ABOX.Text;
            listView1.SelectedItems[0].SubItems[5].Text = GBOX.Text;
            listView1.SelectedItems[0].SubItems[6].Text = DOBBOX.Text;
            listView1.SelectedItems[0].SubItems[7].Text = CBOX.Text;

            UBTN.Enabled = false;
            DBTN.Enabled = false;
            NBTN.Enabled = true;
            ABTN.Enabled = false;


            FNBOX.Enabled = false;
            IDBOX.Enabled = false;
            EABOX.Enabled = false;
            ADDBOX.Enabled = false;
            ABOX.Enabled = false;
            GBOX.Enabled = false;
            DOBBOX.Enabled = false;
            CBOX.Enabled = false;


            FNBOX.Text = "";
            IDBOX.Text = "";
            EABOX.Text = "";
            ADDBOX.Text = "";
            ABOX.Text = "";
            GBOX.Text = "";
            DOBBOX.Text = "";
            CBOX.Text = "";
        }

        private void listView1_Click(object sender, EventArgs e)
        {
            FNBOX.Text = listView1.SelectedItems[0].SubItems[0].Text;
            IDBOX.Text = listView1.SelectedItems[0].SubItems[1].Text;
            EABOX.Text = listView1.SelectedItems[0].SubItems[2].Text;
            ADDBOX.Text = listView1.SelectedItems[0].SubItems[3].Text;
            ABOX.Text = listView1.SelectedItems[0].SubItems[4].Text;
            GBOX.Text = listView1.SelectedItems[0].SubItems[5].Text;
            DOBBOX.Text = listView1.SelectedItems[0].SubItems[6].Text;
            CBOX.Text = listView1.SelectedItems[0].SubItems[7].Text;
            UBTN.Enabled = true;
            NBTN.Enabled = false;
            ABTN.Enabled = false;
            DBTN.Enabled = true;

            FNBOX.Enabled = true;
            IDBOX.Enabled = true;
            EABOX.Enabled = true;
            ADDBOX.Enabled = true;
            ABOX.Enabled = true;
            GBOX.Enabled = true;
            DOBBOX.Enabled = true;
            CBOX.Enabled = true;
        }

        private void NBTN_MouseEnter(object sender, EventArgs e)
        {

        }

        private void NBTN_MouseLeave(object sender, EventArgs e)
        {

        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            UserRole rolePage = new UserRole();
            rolePage.Show();

            // Close the current Admin page so it doesn't stay open in the background
            this.Close();
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            panelfillup.Visible = false;
            panelteachers.Visible = true;
            panelteachers.BringToFront();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            panelteachers.Visible = false;
            panelfillup.Visible = true;
            panelfillup.BringToFront();
        }

        private void panelteachers_Paint(object sender, PaintEventArgs e)
        {
          
            Tlistview.Columns.Clear();

    
            Tlistview.Columns.Add("Subject Code", 300);
            Tlistview.Columns.Add("Subject Name", 340);
            Tlistview.Columns.Add("Time", 300);
            Tlistview.Columns.Add("Schedules(Days)", 350);

        }

        private void NEWBTN_Click(object sender, EventArgs e)
        {
            SCBOX.Enabled = true;
            SNBOX.Enabled = true;
            TBOX.Enabled = true;


            NEWBTN.Enabled = false;
            ASBTN.Enabled = true;
            USBTN.Enabled = false;
            CBTN.Enabled = false;
        }

        private void Tlistview_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void ASBTN_Click(object sender, EventArgs e)
        {

            Subject newSub = new Subject();
            newSub.Code = SCBOX.Text;
            newSub.Name = SNBOX.Text;
            newSub.TimeSlot = TBOX.Text;

            string selectedDays = "";
            if (MON.Checked) selectedDays += "Mon ";
            if (TUE.Checked) selectedDays += "Tue ";
            if (WED.Checked) selectedDays += "Wed ";
            if (THU.Checked) selectedDays += "Thu ";
            if (FRI.Checked) selectedDays += "Fri ";

            newSub.Schedule = selectedDays.Trim();


            DataStorage.AllSubjects.Add(newSub);

            ListViewItem item = new ListViewItem(newSub.Code);
            item.SubItems.Add(newSub.Name);
            item.SubItems.Add(newSub.TimeSlot);
            item.SubItems.Add(newSub.Schedule);
            Tlistview.Items.Add(item);


            MessageBox.Show("Subject has been distributed to the Teacher's record.");
            ClearSubjectForm();


            ASBTN.Enabled = false;
            NEWBTN.Enabled = true;
            USBTN.Enabled = false;
            CBTN.Enabled = false;

            SCBOX.Text = "";
            SNBOX.Text = "";
            TBOX.Text = "";
           


            SCBOX.Enabled = false;
            SNBOX.Enabled = false;
            TBOX.Enabled = false;
         
            

        }
        private void ClearSubjectForm()
        {
           
            SCBOX.Clear();
            SNBOX.Clear();
            TBOX.Clear();

           
            MON.Checked = false;
            TUE.Checked = false;
            WED.Checked = false;
            THU.Checked = false;
            FRI.Checked = false;
        }

        private void USBTN_Click(object sender, EventArgs e)
        {
           
            Tlistview.SelectedItems[0].SubItems[0].Text = SCBOX.Text;
            Tlistview.SelectedItems[0].SubItems[1].Text = SNBOX.Text;
            Tlistview.SelectedItems[0].SubItems[2].Text = TBOX.Text;

            string updatedDays = "";
            if (MON.Checked) updatedDays += "Mon ";
            if (TUE.Checked) updatedDays += "Tue ";
            if (WED.Checked) updatedDays += "Wed ";
            if (THU.Checked) updatedDays += "Thu ";
            if (FRI.Checked) updatedDays += "Fri ";

           
            Tlistview.SelectedItems[0].SubItems[3].Text = updatedDays.Trim();
          

            USBTN.Enabled = false;
            CBTN.Enabled = false;
            NEWBTN.Enabled = true;
            ASBTN.Enabled = false;


            SCBOX.Enabled = false;
            SNBOX.Enabled = false;
            TBOX.Enabled = false;
            

            SCBOX.Text = "";
            SNBOX.Text = "";
            TBOX.Text = "";

        }

        private void Tlistview_Click(object sender, EventArgs e)
        {
            SCBOX.Text = Tlistview.SelectedItems[0].SubItems[0].Text;
            SNBOX.Text = Tlistview.SelectedItems[0].SubItems[1].Text;
            TBOX.Text = Tlistview.SelectedItems[0].SubItems[2].Text;


            string schedule = Tlistview.SelectedItems[0].SubItems[3].Text;

            MON.Checked = schedule.Contains("Mon");
           TUE.Checked = schedule.Contains("Tue");
           WED.Checked = schedule.Contains("Wed");
            THU.Checked = schedule.Contains("Thu");
            FRI.Checked = schedule.Contains("Fri");

            USBTN.Enabled = true;
            CBTN.Enabled = true;
            NEWBTN.Enabled = false;
            ASBTN.Enabled = false;


            SCBOX.Enabled = true;
            SNBOX.Enabled = true;
            TBOX.Enabled = true;


            SCBOX.Text = "";
            SNBOX.Text = "";
            TBOX.Text = "";        
            
            
            
          
        }

        private void CBTN_Click(object sender, EventArgs e)
        {
            if (Tlistview.SelectedItems.Count > 0)
            {
               
                Tlistview.Items.Remove(Tlistview.SelectedItems[0]);


                USBTN.Enabled = false;
                DBTN.Enabled = false;
                NEWBTN.Enabled = true;
                ASBTN.Enabled = false;

              
                SCBOX.Enabled = false;
                SNBOX.Enabled = false;
                TBOX.Enabled = false;

                
                ClearSubjectForm();

                MessageBox.Show("Subject deleted successfully.");

            }
    
        }

        private void label9_Click(object sender, EventArgs e)
        {

        }
    }
}
    


