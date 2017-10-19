package com.study.other.enumtest;

public enum PayrollDay {
	MONDAY(PayType.WEEKDAY), 
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);

	private final PayType payType;

	PayrollDay(PayType payType) {
		this.payType = payType;
	}

	double pay(double hoursWorked, double payRate) {
		return payType.pay(hoursWorked, payRate);
	}

	private enum PayType {
		WEEKDAY {
			double overtimePay(double hours, double payRate) {
				return hours <= HOURS_PER_SHIFT ? 0 : (hours - HOURS_PER_SHIFT)
						* payRate / 2;
			}
		},
		WEEKEND {
			double overtimePay(double hours, double payRate) {
				return hours * payRate / 2;
			}
		};
		private static final int HOURS_PER_SHIFT = 8;

		abstract double overtimePay(double hours, double payRate);

		double pay(double hoursWorked, double payRate) {
			double basePay = hoursWorked * payRate;
			return basePay + overtimePay(hoursWorked, payRate);
		}
	}

	public static void main(String[] args) {
		
		
		for(PayrollDay p:PayrollDay.values()){
			System.out.println(p+":"+p.payType.overtimePay(20, 8));
		}
		
		
		System.out.println(PayrollDay.MONDAY);
		System.out.println(PayrollDay.TUESDAY);
		System.out.println(PayrollDay.WEDNESDAY);
		System.out.println(PayrollDay.THURSDAY);
		System.out.println(PayrollDay.FRIDAY);
		System.out.println(PayrollDay.SATURDAY);
		System.out.println(PayrollDay.SUNDAY);
	}
}