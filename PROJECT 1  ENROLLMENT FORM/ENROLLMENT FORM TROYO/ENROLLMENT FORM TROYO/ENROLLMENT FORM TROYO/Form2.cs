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
    public partial class SPAGE : Form
    {
        public SPAGE()
        {
            InitializeComponent();
        }

        private void BSIT_MouseEnter(object sender, EventArgs e)
        {
            
        }

        private void BSIT_MouseLeave(object sender, EventArgs e)
        {
        
        }

        private void BSIT_Click(object sender, EventArgs e)
        {

        }

        private void SPAGE_Load(object sender, EventArgs e)
        {

        }

        private void BSN_Click(object sender, EventArgs e)
        {
           
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void STUDENT_Click(object sender, EventArgs e)
        {

        }

        private void STUDENT_MouseEnter(object sender, EventArgs e)
        {
           
        }

        private void bsit_MouseLeave_1(object sender, EventArgs e)
        {
        
        }

        private void bsn_MouseEnter(object sender, EventArgs e)
        {
           
        }

        private void bsn_MouseLeave(object sender, EventArgs e)
        {
           
        }

        private void bsba_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bsba_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bsed_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bsed_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bsthm_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bsthm_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bshk_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bshk_MouseMove(object sender, MouseEventArgs e)
        {

        }

        private void bshk_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bsen_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bsen_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bscje_MouseEnter(object sender, EventArgs e)
        {

        }

        private void bscje_MouseLeave(object sender, EventArgs e)
        {

        }

        private void shs_MouseEnter(object sender, EventArgs e)
        {

        }

        private void shs_MouseLeave(object sender, EventArgs e)
        {

        }

        private void bsit_Click_1(object sender, EventArgs e)
        {
           
        }

        private void button1_MouseEnter(object sender, EventArgs e)
        {
            BTNIT.BackColor = Color.Violet;
            BTNIT.ForeColor = Color.White;
        }

        private void BTNIT_Click(object sender, EventArgs e)
        {
            bsitview ef1 = new bsitview();
            ef1.Show();
            this.Hide();
        }

        private void BTNIT_MouseLeave(object sender, EventArgs e)
        {
            BTNIT.BackColor = Color.Transparent; 
            BTNIT.ForeColor = Color.Black;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            bsnview ef1 = new bsnview();
            ef1.Show();
            this.Hide();
        }

        private void button2_MouseEnter(object sender, EventArgs e)
        {
            BTNN.BackColor = Color.Green;
            BTNN.ForeColor = Color.White;
           
        }

        private void button2_MouseLeave(object sender, EventArgs e)
        {
          
            BTNN.BackColor = Color.Transparent;
            BTNN.ForeColor = Color.Black;
        }

        private void button3_MouseEnter(object sender, EventArgs e)
        {
            BTNBSBA.BackColor = Color.Yellow;
            BTNBSBA.ForeColor = Color.White;
        }

        private void button3_MouseLeave(object sender, EventArgs e)
        {
            BTNBSBA.BackColor = Color.Transparent;
            BTNBSBA.ForeColor = Color.Black;
        }

        private void BTNBSED_Click(object sender, EventArgs e)
        {
            bseview ef1 = new bseview();
            ef1.Show();
            this.Hide();
        }

        private void BTNBSED_MouseEnter(object sender, EventArgs e)
        {
            BTNBSED.BackColor = Color.Blue;
            BTNBSED.ForeColor = Color.White;
        
        }

        private void BTNBSED_MouseLeave(object sender, EventArgs e)
        {
            
            BTNBSED.BackColor = Color.Transparent;
            BTNBSED.ForeColor = Color.Black;
        }

        private void BTNBSTHM_MouseEnter(object sender, EventArgs e)
        {
            BTNBSTHM.BackColor = Color.Pink;
            BTNBSTHM.ForeColor = Color.White;
        
        }

        private void BTNBSTHM_MouseLeave(object sender, EventArgs e)
        {

            BTNBSTHM.BackColor = Color.Transparent;
            BTNBSTHM.ForeColor = Color.Black;
        }

        private void BTNBSHK_Click(object sender, EventArgs e)
        {
            bshkview ef1 = new bshkview();
            ef1.Show();
            this.Hide();
        }

        private void BTNBSHK_MouseEnter(object sender, EventArgs e)
        {
            BTNBSHK.BackColor = Color.Cyan;
            BTNBSHK.ForeColor = Color.White;
       
        }

        private void BTNBSHK_MouseLeave(object sender, EventArgs e)
        {
      
            BTNBSHK.BackColor = Color.Transparent;
            BTNBSHK.ForeColor = Color.Black;
        }

        private void BTNBSEN_Click(object sender, EventArgs e)
        {
            bsenview ef1 = new bsenview();
            ef1.Show();
            this.Hide();
        }

        private void BTNBSEN_MouseEnter(object sender, EventArgs e)
        {
            BTNBSEN.BackColor = Color.Orange;
            BTNBSEN.ForeColor = Color.White;
            
        }

        private void BTNBSEN_MouseLeave(object sender, EventArgs e)
        {
       
            BTNBSEN.BackColor = Color.Transparent;
            BTNBSEN.ForeColor = Color.Black;
        }

        private void BTNBSCJE_MouseEnter(object sender, EventArgs e)
        {
            BTNBSCJE.BackColor = Color.MistyRose;
            BTNBSCJE.ForeColor = Color.White;
         
        }

        private void BTNBSCJE_MouseLeave(object sender, EventArgs e)
        {
            
            BTNBSCJE.BackColor = Color.Transparent;
            BTNBSCJE.ForeColor = Color.Black;
        }

        private void BTNSHS_Click(object sender, EventArgs e)
        {
            shsview ef1 = new shsview();
            ef1.Show();
            this.Hide();
        }

        private void BTNSHS_MouseEnter(object sender, EventArgs e)
        {
            BTNSHS.BackColor = Color.Brown;
            BTNSHS.ForeColor = Color.White;
           
        }

        private void BTNSHS_MouseLeave(object sender, EventArgs e)
        {
         
            BTNSHS.BackColor = Color.Transparent;
            BTNSHS.ForeColor = Color.Black;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.Hide();
             UserRole ef1 = new UserRole();
            ef1.Show();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label17_Click(object sender, EventArgs e)
        {

        }

        private void BTNBSBA_Click(object sender, EventArgs e)
        {
            bsbaview ef1 = new bsbaview();
            ef1.Show();
            this.Hide();
        }

        private void BTNBSTHM_Click(object sender, EventArgs e)
        {
            bsthmview ef1 = new bsthmview();
            ef1.Show();
            this.Hide();
        }

        private void BTNBSCJE_Click(object sender, EventArgs e)
        {
            bscjeview ef1 = new bscjeview();
            ef1.Show();
            this.Hide();
        }
    }
}


