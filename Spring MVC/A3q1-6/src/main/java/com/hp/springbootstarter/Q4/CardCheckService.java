package com.hp.springbootstarter.Q4;

import org.springframework.stereotype.Service;

@Service
public class CardCheckService {

	public String checkCard(String num) {

		if (num.length() >= 15) {
			if (num.substring(0, 4).equals("2014") || num.substring(0, 4).equals("2149"))
				return "enRoute";

		} else if (num.length() == 16) {
			if (Integer.parseInt(num.substring(0, 6)) >= 601100 && Integer.parseInt(num.substring(0, 6)) <= 601109
					|| Integer.parseInt(num.substring(0, 6)) >= 601120
							&& Integer.parseInt(num.substring(0, 6)) <= 601149
					|| Integer.parseInt(num.substring(0, 6)) == 601174
					|| Integer.parseInt(num.substring(0, 6)) >= 601177
							&& Integer.parseInt(num.substring(0, 6)) <= 601179
					|| Integer.parseInt(num.substring(0, 6)) >= 601186
							&& Integer.parseInt(num.substring(0, 6)) <= 601199
					|| Integer.parseInt(num.substring(0, 6)) >= 644000
							&& Integer.parseInt(num.substring(0, 6)) <= 659999

			) {
				return "AMex";
			} else if (Integer.parseInt(num.substring(1, 6)) > 510000 && Integer.parseInt(num.substring(1, 6)) < 559999
					|| Integer.parseInt(num.substring(1, 6)) > 222100 && Integer.parseInt(num.substring(1, 6)) < 272099)
				return "MasterCard";
		}

		else if (num.length() >= 16 && num.length() < 19) {
			if (Integer.parseInt(num.substring(0, 3)) > 3528 && Integer.parseInt(num.substring(0, 3)) < 3589)
				return "JCB";
		} else if (num.length() <= 19) {
			if (num.startsWith("4"))
				return "Visa";
		} else {
			return "Invalid Card else";

		}
		return "Invalid Card";

	}
}
