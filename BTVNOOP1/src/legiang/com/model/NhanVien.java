package legiang.com.model;

	public class NhanVien {

		private String ho;
		private String ten;
		private int soSP;
		public String getHo() {
			return ho;
		}
		public void setHo(String ho) {
			this.ho = ho;
		}
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public int getSoSP() {
			return soSP;
		}
		public void setSoSP(int soSP) {
			this.soSP = soSP;
		}
		public NhanVien(String ho, String ten, int soSP) {
			super();
			this.ho = ho;
			this.ten = ten;
			if(soSP<0)
			{
				this.soSP=0;
			}
			else this.soSP=soSP;
		}
		public NhanVien() {
			super();
		}
		
		public double tinhLuong()
		{
			double luong;
			if(soSP>0 && soSP<200)
			{
				luong=soSP*0.5;
			}
			else if(soSP>=200 && soSP<400)
			{
				luong=soSP*0.55;
			}
			else if(soSP>=400 && soSP<600)
			{
				luong=soSP*0.6;
			}
			else luong=soSP*0.65;
			return luong;
		}
		public boolean LonHon(NhanVien nv2)
		{
			if(soSP > nv2.soSP) return true;
			else return false;
		}
		
		
	}


