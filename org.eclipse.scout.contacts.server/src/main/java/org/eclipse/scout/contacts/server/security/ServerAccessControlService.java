package org.eclipse.scout.contacts.server.security;

import java.security.AllPermission;
import java.security.Permissions;

import org.eclipse.scout.contacts.shared.security.AccessControlService;
import org.eclipse.scout.rt.platform.Replace;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

/**
 * @author Camy
 */
@Replace
public class ServerAccessControlService extends AccessControlService {

	@Override
	protected Permissions execLoadPermissions(String userId) {
		Permissions permissions = new Permissions();
		permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

		// TODO [Camy]: Fill access control service
		permissions.add(new AllPermission());
		return permissions;
	}
}
