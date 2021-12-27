/*
 * Copyright (C) 2018-2021 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.arguments;

import java.util.Locale;
import java.util.function.Function;

import am.ik.yavi.core.ConstraintGroup;
import am.ik.yavi.core.ConstraintViolationsException;
import am.ik.yavi.core.Validated;
import am.ik.yavi.jsr305.Nullable;

/**
 * Generated by https://github.com/making/yavi/blob/develop/scripts/generate-args.sh
 *
 * @since 0.3.0
 */
@FunctionalInterface
public interface Arguments11Validator<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, X> {

	Validated<X> validate(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			Locale locale, ConstraintGroup constraintGroup);

	/**
	 * @since 0.7.0
	 */
	default <X2> Arguments11Validator<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, X2> andThen(
			Function<? super X, ? extends X2> mapper) {
		return (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, locale,
				constraintGroup) -> Arguments11Validator.this.validate(a1, a2, a3, a4, a5,
						a6, a7, a8, a9, a10, a11, locale, constraintGroup).map(mapper);
	}

	/**
	 * @since 0.7.0
	 */
	default <A> Arguments1Validator<A, X> compose(
			Function<? super A, ? extends Arguments11<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7, ? extends A8, ? extends A9, ? extends A10, ? extends A11>> mapper) {
		return (a, locale, constraintGroup) -> {
			final Arguments11<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5, ? extends A6, ? extends A7, ? extends A8, ? extends A9, ? extends A10, ? extends A11> args = mapper
					.apply(a);
			return Arguments11Validator.this.validate(args.arg1(), args.arg2(),
					args.arg3(), args.arg4(), args.arg5(), args.arg6(), args.arg7(),
					args.arg8(), args.arg9(), args.arg10(), args.arg11(), locale,
					constraintGroup);
		};
	}

	default Validated<X> validate(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11) {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11,
				Locale.getDefault(), ConstraintGroup.DEFAULT);
	}

	default Validated<X> validate(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			ConstraintGroup constraintGroup) {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11,
				Locale.getDefault(), constraintGroup);
	}

	default Validated<X> validate(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			Locale locale) {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, locale,
				ConstraintGroup.DEFAULT);
	}

	default X validated(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11)
			throws ConstraintViolationsException {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)
				.orElseThrow(ConstraintViolationsException::new);
	}

	default X validated(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			ConstraintGroup constraintGroup) throws ConstraintViolationsException {
		return this
				.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, constraintGroup)
				.orElseThrow(ConstraintViolationsException::new);
	}

	default X validated(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			Locale locale) throws ConstraintViolationsException {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, locale)
				.orElseThrow(ConstraintViolationsException::new);
	}

	default X validated(@Nullable A1 a1, @Nullable A2 a2, @Nullable A3 a3,
			@Nullable A4 a4, @Nullable A5 a5, @Nullable A6 a6, @Nullable A7 a7,
			@Nullable A8 a8, @Nullable A9 a9, @Nullable A10 a10, @Nullable A11 a11,
			Locale locale, ConstraintGroup constraintGroup)
			throws ConstraintViolationsException {
		return this.validate(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, locale,
				constraintGroup).orElseThrow(ConstraintViolationsException::new);
	}

}
