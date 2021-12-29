package am.ik.yavi.constraint.temporal;

import java.time.LocalDate;

/**
 * This is the actual class for constraints on LocalDate.
 *
 * @author Diego Krupitza
 * @since 0.10.0
 */
public class LocalDateConstraint<T>
		extends ChronoLocalDateConstraintBase<T, LocalDate, LocalDateConstraint<T>> {

	@Override
	public LocalDateConstraint<T> cast() {
		return this;
	}
}
