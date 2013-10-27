/*
 * Fenix Planner
 * Copyright (C) 2013 Petter Holmström
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.peholmst.fenix.planner.model;

import java.awt.image.BufferedImage;

/**
 * @author Petter Holmström
 */
public class Header {

    private final MultilingualContent<String> departmentName = new MultilingualContent<>("");
    private final MultilingualContent<String> sectionName = new MultilingualContent<>("");
    private final MultilingualContent<String> heading = new MultilingualContent<>("");
    private String authorInitials = "";
    private BufferedImage logo;

    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }

    public boolean hasLogo() {
        return logo != null;
    }

    public String getAuthorInitials() {
        return authorInitials;
    }

    public void setAuthorInitials(String authorInitials) {
        if (authorInitials == null) {
            authorInitials = "";
        }
        this.authorInitials = authorInitials;
    }

    public MultilingualContent<String> getDepartmentName() {
        return departmentName;
    }

    public MultilingualContent<String> getSectionName() {
        return sectionName;
    }

    public MultilingualContent<String> getHeading() {
        return heading;
    }
}
