package be.insaneprogramming.cleanarch.responsemodel;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public interface BuildingResponseModel {
	String getId();
	String getName();
	List<TenantResponseModel> getTenants();
}