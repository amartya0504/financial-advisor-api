package com.fin.advisor.common;

import static com.fin.advisor.constant.ApplicationConstant.BLANK_SPACE;
import static com.fin.advisor.constant.ApplicationConstant.CURRENCY_FORMATTER;
import static com.fin.advisor.constant.ApplicationConstant.NULL_STRING;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * @author amartya.bhattacharyya
 * Util class for common functionality.
 */
@Component
public class CommonUtil {


	public double findMin(double... vals) {
	
		return Arrays.stream(vals)
	      .min()
	      .getAsDouble();
	}

	public String getCurrencyValueOf(Object currencyObject) {
		String result = BLANK_SPACE;
		if (null != currencyObject && !NULL_STRING.equalsIgnoreCase(currencyObject.toString().trim())
				&& !BLANK_SPACE.equalsIgnoreCase(currencyObject.toString().trim())) {
			result = CURRENCY_FORMATTER.format(Double.parseDouble(currencyObject.toString().trim()));
		}
		return result;
	}
}
